class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/func
    fun loginCek():Boolean{
        if(username.equals("alfina") && password.equals("fire")){
            return true
        }else{
            return false
        }
    }
}