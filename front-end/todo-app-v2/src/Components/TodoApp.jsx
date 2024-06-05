import LoginComponent from "./LoginComponent";
import WelcomeComponent from "./WelcomeComponet";
import ResourceNotFound from "./ResourceNotFound";
import './TodoApp.css';
import { BrowserRouter, Routes, Route} from "react-router-dom";
import ListTodosComponent from "./ListTodosCompoent";
import HeaderComponent from "./HeaderComponent";

import FooterComponent from "./FooterComponent";
import Logout from "./Logout";

function TodoApp(){
    return(
     <div>
       <HeaderComponent />

       <BrowserRouter>
           <Routes>
               <Route path="/" element = {<LoginComponent />}></Route>
               <Route path="/login" element = {<LoginComponent />}></Route>
               <Route path="/welcome/:username" element = {<WelcomeComponent />}></Route>
               <Route path="todos" element = {<ListTodosComponent />} />
               <Route path="/logout" element = {<Logout />} />
               <Route path="*" element={<ResourceNotFound />} ></Route>
           </Routes>
       </BrowserRouter>

       <FooterComponent />
       </div>
        // <div>
        //     <LoginComponent />
        //     <WelcomeComponent />
        // </div>
    );
}

export default TodoApp;