
import { Link, useParams } from "react-router-dom";

function WelcomeComponent(){

    const params = useParams();
    return(
        <div className="welcome">
           <h1>welcome {params.username} </h1>
           Manage Your Todos.
            <Link to = "/todos">go here</Link>
           
        </div>
    );
}

export default WelcomeComponent;