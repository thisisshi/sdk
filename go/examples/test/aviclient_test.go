package test

import (
	"errors"
	"fmt"
	"github.com/avinetworks/sdk/go/clients"
	"github.com/avinetworks/sdk/go/session"
	"os"
	"testing"
)


func TestAviClientWithInvalidController(t *testing.T) {
	aviClient, err := clients.NewAviClient("1.1.1.1", "admin",
		session.SetPassword(os.Getenv("password")),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))
	if err != nil {
		fmt.Println("Issue with lazyauthentication")
		t.Fail()
	}
	hmData, err := aviClient.HealthMonitor.GetAll()
	if hmData == nil || err != nil {
		fmt.Println("Got expected error for invalid controller IP. [ERROR]:", err.Error())
	} else {
		fmt.Println("Didn't get the error for invalid controller IP.")
		t.Fail()
	}
}


func TestUpdatePassword(t *testing.T) {
	password := os.Getenv("password")
	new_password := password + "1"
	path := "api/useraccount"
	hm_path := "api/healthmonitor"
	var robj interface{}
	aviClientNewPassword, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetPassword(new_password),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))
	err := aviClientNewPassword.AviSession.Get(hm_path, &robj)
	if err == nil {
		fmt.Println("Didn't get expected error for wrong password")
		t.Fail()
	}

	aviClientOldPassword, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetPassword(password),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))
	data := make(map[string]string)
	data["username"] = "admin"
	data["name"] = "admin"
	data["old_password"] = password
	data["password"] = new_password
	err = aviClientOldPassword.AviSession.Put(path, data, &robj)
	if err != nil {
		fmt.Println("Error while updating the password. [ERROR]: ", err)
		t.Fail()
	}

	err = aviClientNewPassword.AviSession.Get(hm_path, &robj)
	if err != nil {
		fmt.Println("Got the error after updating the password. [ERROR]: ", err)
		t.Fail()
	}

	//Teardown
	data["password"] = password
	data["old_password"] = new_password
	err = aviClientNewPassword.AviSession.Put(path, data, &robj)
	if err != nil {
		fmt.Println("Error while updating the password. [ERROR]: ", err)
		t.Fail()
	}
}


func get_valid_token() string {
	token_path := "api/user-token"
	password := os.Getenv("password")
	var robj interface{}
	data := make(map[string]string)
	data["hours"] = "2"

	aviClientAuthToken, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetPassword(password),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))

	err := aviClientAuthToken.AviSession.Post(token_path, data, &robj)
	if err != nil {
		fmt.Println("Error while getting auth token. [ERROR]: ", err)
		return ""
	}
	token := fmt.Sprintf("%v", robj.(map[string]interface{})["token"])
	return token
}


func get_valid_token_V2() (string, error) {
	token_path := "api/user-token"
	password := os.Getenv("password")
	var robj interface{}
	data := make(map[string]string)
	data["hours"] = "2"

	aviValidAuthToken, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetPassword(password),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))

	err := aviValidAuthToken.AviSession.Post(token_path, data, &robj)
	if err != nil {
		fmt.Println("Error while getting auth token. [ERROR]: ", err)
		return "", err
	}
	token := fmt.Sprintf("%v", robj.(map[string]interface{})["token"])
	return token, nil
}


func get_invalid_token_V2() (string, error) {
	return "", errors.New("Invalid token from callback method")
}


func TestValidAuthToken(t *testing.T) {

	hm_path := "api/healthmonitor"
	var robj interface{}

	aviClientSetAuthToken, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetRefreshAuthTokenCallback(get_valid_token),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))
	err := aviClientSetAuthToken.AviSession.Get(hm_path, &robj)
	if err != nil {
		fmt.Println("Error while getting avi objects by using SetRefreshAuthTokenCallback functionality. [Error]",
			err)
		t.Fail()
	}

	//Without Lazy Authentication
	if aviClient, err := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetRefreshAuthTokenCallback(get_valid_token),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure); err != nil {
		fmt.Println("Error while creating a sdk client with SetRefreshAuthTokenCallback method")
		t.Fail()
	} else if err := aviClient.AviSession.Get(hm_path, &robj); err != nil {
		fmt.Println("Error while getting avi objects by using SetRefreshAuthTokenCallback functionality. [Error]",
			err)
		t.Fail()
		}
}


func TestValidAuthToken_V2(t *testing.T) {

	hm_path := "api/healthmonitor"
	var robj interface{}

	aviClientSetAuthToken, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetRefreshAuthTokenCallback_V2(get_valid_token_V2),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))

	if err := aviClientSetAuthToken.AviSession.Get(hm_path, &robj); err != nil {
		fmt.Println("Error while getting avi objects by using SetRefreshAuthTokenCallback functionality. [Error]",
			err)
		t.Fail()
	}

	//Without Lazy Authentication
	if aviClient, err := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetRefreshAuthTokenCallback_V2(get_valid_token_V2),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure); err != nil {
		fmt.Println("Error while creating a sdk client with SetRefreshAuthTokenCallback V2 method")
		t.Fail()
	} else if err := aviClient.AviSession.Get(hm_path, &robj); err != nil {
		fmt.Println("Error while getting avi objects by using SetRefreshAuthTokenCallback V2 functionality. " +
			"[Error]", err)
		t.Fail()
	}
}

func TestInvalidAuthToken_V2(t *testing.T) {

	hm_path := "api/healthmonitor"
	var robj interface{}

	aviClientSetAuthToken, _ := clients.NewAviClient(os.Getenv("controller"), "admin",
		session.SetRefreshAuthTokenCallback_V2(get_invalid_token_V2),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure, session.SetLazyAuthentication(true))
	if err := aviClientSetAuthToken.AviSession.Get(hm_path, &robj); err == nil {
		fmt.Println("Didn't get expected error for wrong token using SetRefreshAuthTokenCallback V2 functionality")
		t.Fail()
	} else if err.Error() != "Invalid token from callback method" {
		fmt.Println("Didn't get expected error from callback method")
		t.Fail()
	}

	//Without Lazy Authentication
	if _, err := clients.NewAviClient(
		os.Getenv("controller"), "admin",
		session.SetRefreshAuthTokenCallback_V2(get_invalid_token_V2),
		session.SetTenant("admin"),
		session.SetVersion(os.Getenv("version")),
		session.SetInsecure); err == nil {
		fmt.Println("Didn't get expected error for wrong token")
		t.Fail()
	} else if err.Error() != "Invalid token from callback method" {
		fmt.Println("Didn't get expected error from calback method")
		t.Fail()
	}
}
