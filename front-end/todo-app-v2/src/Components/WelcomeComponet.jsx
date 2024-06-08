
import { Link, useParams } from "react-router-dom";
import axios from "axios";
import { useState } from "react";


function WelcomeComponent(){

    const [message, setMessage] = useState();
    
    function callHelloWorldAPI(){
       console.log("clicked");
       axios.get("http://127.0.0.1:8080/hello-world")
         .then((response)=> successResponse(response))
         .catch((error) => errorResponse(error))
         .finally(()=> console.log("Cleanup activities here"));
    }

    function successResponse(response){
        console.log(response);
        console.log(response.data);
        setMessage(response.data);
    }

    function errorResponse(error){
        console.log(error);
    }

    function getApiData2(){
        axios.get("http://127.0.0.1:8080/hello-world-bean")
             .then((response)=> successResponse2(response))
             .catch((error)=> errorResponse2(error))
             .finally(()=> console.log("Clean Up activities for the API 2"));
    }

    function successResponse2(response){
        console.log(response.data.message);
        alert(response.data.message);
    }

    function errorResponse2(error){
        console.log(error);
    }



    const params = useParams();
    return(
        <div className="welcome">
           <h1>welcome {params.username} </h1>
           Manage Your Todos.
            <Link to = "/todos">go here</Link>
           <div style={{marginTop:"20px"}}>
               <button className="btn btn-success" onClick={callHelloWorldAPI}>Call Hello Wolrd API</button>
           </div>
           
           <div className="text-info m-4">
            <p>{message}</p>
           </div>

           <div className="mt-5">
              <button className="btn btn-success" onClick={getApiData2}>Call 2nd API</button>
           </div>

        </div>
    );
}

export default WelcomeComponent;