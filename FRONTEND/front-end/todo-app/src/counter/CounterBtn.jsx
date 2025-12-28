
import PropTypes from 'prop-types';
function CounterBtn(props){
    function decrementby(){
        props.dec(props.by);
    }
    return(
        <div>
             <button className="counterBtn" onClick={()=> props.inc(props.by)}>+{props.by}</button>
              <button className="counterBtn" onClick={decrementby}>-{props.by}</button>
        </div>
    );
}
CounterBtn.propTypes =  {
    by : PropTypes.number
 }
 

 export default CounterBtn;