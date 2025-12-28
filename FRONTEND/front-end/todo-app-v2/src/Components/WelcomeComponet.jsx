
import { Link, useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import { retrieveHelloWorldAPI,retrieveHelloWorldPathVariableAPI } from "./API/HelloWorldApiService";


function WelcomeComponent(){

    const [message, setMessage] = useState();

    function callHelloWorldAPI(){
        // retrieveHelloWorldAPI()
        // .then((response) => successCall(response))
        // .catch((error) => errorCall(error))
        // .finally(()=> console.log("Cleanup calls"));

        retrieveHelloWorldPathVariableAPI("Mobin Arshad")
        .then((response) => successCall(response))
        .catch((error) => errorCall(error))
        .finally(()=> console.log("Cleanup calls"));
    }
    
    function successCall(response){
        console.log(response)
        setMessage(response.data.name);
    }

    function errorCall(error){
        console.log(error);
    }

    // const successCall = (response)=> setMessage(response.data.message); 
    // const errorCall = (error) => console.log(error);

    

   useEffect(()=>{
    callHelloWorldAPI()
   }, []);

    const params = useParams();
    return(
        <div className="welcome">
           <h1>{message}</h1>
           Manage Your Todos.
            <Link to = "/todos">go here</Link>
           <div style={{marginTop:"20px"}}>
               <button className="btn btn-success" onClick={callHelloWorldAPI}>Call Hello Wolrd API</button>
           </div>
           
           <div className="text-info m-4">
            <p>{message}</p>
           </div>
        </div>
    );
}

export default WelcomeComponent;