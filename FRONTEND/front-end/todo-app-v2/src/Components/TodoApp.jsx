import LoginComponent from "./LoginComponent";
import WelcomeComponent from "./WelcomeComponet";
import ResourceNotFound from "./ResourceNotFound";
import './TodoApp.css';
import { BrowserRouter, Routes, Route, Navigate} from "react-router-dom";
import ListTodosComponent from "./ListTodosCompoent";
import HeaderComponent from "./HeaderComponent";

import FooterComponent from "./FooterComponent";
import Logout from "./Logout";
import AuthProvider, { useAuth } from "../security/AuthProvider";


function AutheticatedRoute({children}){
    const auth = useAuth();
    if(auth.isAuthenticated){
        return children;
    }

    return <Navigate to="/" />
}




function TodoApp(){
    
    return(
     <div>
       
      <AuthProvider>
       <BrowserRouter>
       <HeaderComponent />
           <Routes>
               <Route path="/" element = {<LoginComponent />}></Route>
               <Route path="/login" element = {<LoginComponent />}></Route>

               <Route path="/welcome/:username" 
                element = {
                  <AutheticatedRoute>
                      <WelcomeComponent />
                  </AutheticatedRoute>
                }></Route>

               <Route path="todos" element = {
                  <AutheticatedRoute>
                       <ListTodosComponent />
                   </AutheticatedRoute>
                   
                   } />
               <Route path="/logout" element = {
                <AutheticatedRoute>
                     <Logout />
               </AutheticatedRoute>
                } />
               <Route path="*" element={<ResourceNotFound />} ></Route>
           </Routes>
           <FooterComponent />
       </BrowserRouter>
       </AuthProvider>   
    </div>

    );
}

export default TodoApp;