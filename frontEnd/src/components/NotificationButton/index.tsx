import axios from "axios";
import icon from "../../assets/img/send-logo.svg";
import { BASE_URL } from "../../utils/request";
import './styles.css';



type Props = {
    saleId: Number;

}

function NotificationButton({saleId} : Props) {
    return (
        <>
        <div className="dsmeta-aplication-btn" onClick={()=>{handleClick(saleId)}} >

            <img src={icon} alt="Enviar Notificação SMS" />
           
        </div>


        </>
    )
}
function handleClick(id: Number){
    axios(`${BASE_URL}/sales/${id}/notification`)
      .then(response => {
        console.log("SUCESS");    
       // setSales(response.data.content);
      
    }); 
}



export default NotificationButton;