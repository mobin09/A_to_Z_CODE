import { createContext, useContext, useState } from "react";


//1. create a context
//2. share the created context along with other components
export const AuthContext = createContext();
export const useAuth = () => useContext(AuthContext); // making custom hooks useAuth 
//so we can use it anywhere in our applications

function AuthProvider({children}){
   //3. put some state in the context

   const [number, setNumber] = useState(0);
   const [isAuthenticated, setAuthenticated] = useState(false);
   const [userData, setUserData] = useState();

   function login(user, pass){
    if(user === "dummy" && pass === "dummy"){
        setAuthenticated(true);
        setUserData(user);
        return true;

      }else{
        setAuthenticated(false);
        return false;
      }
   }

   function logout(){
      setAuthenticated(false);
   }


    return(
        <AuthContext.Provider value = {{number, isAuthenticated , userData, setUserData, login, logout}}> 
            {children}
        </AuthContext.Provider>
    );
}

export default AuthProvider;