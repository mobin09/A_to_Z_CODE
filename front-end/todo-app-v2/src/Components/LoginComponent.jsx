import { useState } from "react";
import SuccessMessage from "./SuccessMessage";
import ErrorMessage from "./ErrorMessage";
import { useNavigate } from "react-router-dom";

function LoginComponent(){

   
   const navigate = useNavigate();
   const[user, setUser]  =   useState("Dummy");
   const[pass, setPass] = useState("");
   const[message, setMessage] = useState();
   function handleUserName(event){
       setUser(event.target.value);
       //console.log(user);
   }
   

   function handleUserPassword(event){
       setPass(event.target.value);
       //console.log(pass);
   }

   function handleSubmit(){
      if(user === "dummy" && pass === "dummy"){
        setMessage(true);
        navigate(`/welcome/${user}`);
      }else{
        setMessage(false);
        navigate("/login");
      }
      //console.log(user);
      //console.log(pass);
   }

    return (
        <div className="login">

            {message === true ? <SuccessMessage /> : message === false ? <ErrorMessage /> :""}   
            <div className="loginForm">
                <div>
                    <label>User Name</label>
                    <input type="text" name="username" value={user.username} onChange={handleUserName}/>
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name="password"  onChange={handleUserPassword}/>
                </div>

                <div>
                    <button type="button" name="logingBtn" onClick={handleSubmit}>Login</button>
                </div>
            </div>
        </div>
    );
}


export default LoginComponent;