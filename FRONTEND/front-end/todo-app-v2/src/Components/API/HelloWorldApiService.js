import axios from "axios";


// export function retrieveHelloWorldAPI(){
//     return axios.get("http://127.0.0.1:8080/hello-world-bean");
// }

const apiClinet = axios.create(
    {
       baseURL:"http://127.0.0.1:8080" 
    }
    );

export const retrieveHelloWorldAPI = () => apiClinet.get("/hello-world-bean");
export const retrieveHelloWorldPathVariableAPI = (name) => apiClinet.get(`/hello-world/path-variable/${name}`);

export function getAlltodos(username){
    return apiClinet.get(`/users/${username}/todos`);
}


// function callHelloWorldAPI(){
//     console.log("clicked");
//     axios.get("http://127.0.0.1:8080/hello-world")
//       .then((response)=> successResponse(response))
//       .catch((error) => errorResponse(error))
//       .finally(()=> console.log("Cleanup activities here"));
//  }

//  function successResponse(response){
//      console.log(response);
//      console.log(response.data);
//      setMessage(response.data);
//  }

//  function errorResponse(error){
//      console.log(error);
//  }

//  function getApiData2(){
//      axios.get("http://127.0.0.1:8080/hello-world-bean")
//           .then((response)=> successResponse2(response))
//           .catch((error)=> errorResponse2(error))
//           .finally(()=> console.log("Clean Up activities for the API 2"));
//  }

//  function successResponse2(response){
//      console.log(response.data.message);
//      alert(response.data.message);
//  }

//  function errorResponse2(error){
//      console.log(error);
//  }