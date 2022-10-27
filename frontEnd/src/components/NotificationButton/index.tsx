import icon from "../../assets/img/send-logo.svg"
import './styles.css'

function NotificationButton() {
    return (
        <>
        <div className="dsmeta-aplication-btn">

            <img src={icon} alt="Enviar Notificação SMS" />
           
        </div>


        </>
    )
}

export default NotificationButton