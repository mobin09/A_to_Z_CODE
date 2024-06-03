import { useState } from 'react';
import './Counter.css';
import CounterBtn from './CounterBtn';


function Counter(props){
    const [count, setData] = useState(0);
    function increment(by){
        setData(count + by);
    }
    function decrement(by){
        setData(count - by);
    }
    function reset(){
        setData(0);
    }
    return(
        <div> 
             <div>
                <span className="count">{count}</span>
             </div>
              <CounterBtn by={1} inc = {increment} dec = {decrement}/>
              <CounterBtn by={2} inc = {increment} dec = {decrement}/>
              <CounterBtn by={3} inc = {increment} dec = {decrement}/>

              <button className="resetBtn" onClick={reset}>Reset</button>
        </div>
    );
}




export default Counter;