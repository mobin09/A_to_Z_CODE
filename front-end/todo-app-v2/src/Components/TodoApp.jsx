import LoginComponent from "./LoginComponent";
import WelcomeComponent from "./WelcomeComponet";
import ResourceNotFound from "./ResourceNotFound";
import './TodoApp.css';
import { BrowserRouter, Routes, Route} from "react-router-dom";
import ListTodosComponent from "./ListTodosCompoent";
import HeaderComponent from "./HeaderComponent";

import FooterComponent from "./FooterComponent";
import Logout from "./Logout";
import AuthProvider from "../security/AuthProvider";

function TodoApp(){
    return(
     <div>
       
      <AuthProvider>
       <BrowserRouter>
       <HeaderComponent />
           <Routes>
               <Route path="/" element = {<LoginComponent />}></Route>
               <Route path="/login" element = {<LoginComponent />}></Route>
               <Route path="/welcome/:username" element = {<WelcomeComponent />}></Route>
               <Route path="todos" element = {<ListTodosComponent />} />
               <Route path="/logout" element = {<Logout />} />
               <Route path="*" element={<ResourceNotFound />} ></Route>
           </Routes>
           <FooterComponent />
       </BrowserRouter>
       </AuthProvider>   
    </div>

    );
}

export default TodoApp;