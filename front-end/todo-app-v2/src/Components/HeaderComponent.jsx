import { useParams,Link } from "react-router-dom";
import {useAuth } from "../security/AuthProvider";



function HeaderComponent(){

    const params = useParams();
    
   
   const authContext =  useAuth();
   const user = "/welcome/"+authContext.userData;
   const auth = authContext.isAuthenticated;

   function logout(){
    authContext.logout();
   }
  
    return(
        <header className="border-bottom border-light border-5 mb-5 p-2">
        <div className="container">
            <div className="row">
                <nav className="navbar navbar-expand-lg">
                   
                    <a className="navbar-brand ms-2 fs-2 fw-bold text-black" href="https://github.com/mobin09">
                    <img  style={{width:"60px", height:"60px", borderRadius:"50%"}} src="https://avatars.githubusercontent.com/u/86922761?v=4" alt="githublogo"/>
                    </a>
                    <div className="collapse navbar-collapse">
                        <ul className="navbar-nav">
                            <li className="nav-item fs-5">
                                {auth && <Link className="nav-link" to={user}> Home</Link>}
                            </li>
                            <li className="nav-item fs-5">
                                {auth && <Link className="nav-link" to="/todos">Todos</Link>}
                               
                            </li>
                        </ul>
                    </div>
                    <ul className="navbar-nav">
                        <li className="nav-item fs-5">
                             {!auth && <Link className="nav-link" to="/login">Login</Link>}
                        </li>
                        <li className="nav-item fs-5">
                            {auth &&  <Link className="nav-link" to="/logout" onClick={logout}>Logout</Link>}
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </header>

    );
}

export default HeaderComponent;