import './styles.css';
import NotificationButton from '../NotificationButton';
import ReactDatePicker from 'react-datepicker';
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { useEffect, useState } from 'react';
import axios from 'axios';


function Aplicacation() {

    
    const min =  new Date().setDate(new Date().getDate()- 365);
    const teste  =  new Date().setDate(new Date().getDate()-365);

    const [initialDate, setInitialDate] = useState(new Date());
    const [finalDate, setFinalDate] = useState(new Date());


    useEffect(() => {
        axios.get("http://localhost:8080/sales")
        .then(response => {
            console.log(response.data);
        });

    }, []);

  
    return (
        <>
            <div className="dsmeta-card">
                <h2 className="Aplicacao-h2"> Aplicação: </h2>
                <div>
                    <div className="dsmeta-form-control-input">
                        <ReactDatePicker
                           selected={initialDate}
                            onChange={(date: Date) => setInitialDate(date)}
                            className="dsmeta-form-control"
                            dateFormat="dd/MM/yyyy"
                        />
                     </div>

                    <div className="dsmeta-form-control-input">

                        <DatePicker

                            selected={finalDate}
                            onChange={(date: Date) => setFinalDate(date)}
                            className="dsmeta-form-control"
                            dateFormat="dd/MM/yyyy"
                        />
                     </div>
                </div>
                <div>
                    <table className="dsmeta-aplication-table">
                        <thead>
                            <tr>
                                <th className="mostrar992px">ID</th>
                                <th className="mostrar576px">Data</th>
                                <th>Nome</th>
                                <th className="mostrar992px">Visitas</th>
                                <th className="mostrar992px">Vendas</th>
                                <th>Total</th>
                                <th>Notificar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td className="mostrar992px">01</td>
                                <td className="mostrar576px">04/09/2022</td>
                                <td>Jhonnatan</td>
                                <td className="mostrar992px">5</td>
                                <td className="mostrar992px">25000</td>
                                <td>R$ 829500,00</td>
                                <td>
                                    <div className="dsmeta-aplication-btn-container">
                                        <NotificationButton />
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td className="mostrar992px">02</td>
                                <td className="mostrar576px">05/09/2022</td>
                                <td>Mazzaropi</td>
                                <td className="mostrar992px">15</td>
                                <td className="mostrar992px">300</td>
                                <td>R$ 412700,00</td>
                                <td>
                                    <div className="dsmeta-aplication-btn-container">
                                        <NotificationButton />
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td className="mostrar992px">03</td>
                                <td className="mostrar576px">06/09/2022</td>
                                <td>José Sou</td>
                                <td className="mostrar992px">10</td>
                                <td className="mostrar992px">200</td>
                                <td>R$ 215700,00</td>
                                <td>
                                    <div className="dsmeta-aplication-btn-container">
                                        <NotificationButton />
                                    </div>

                                </td>
                            </tr>
                        </tbody>
                    </table>

                </div>
            </div>
        </>
    )
}




export default Aplicacation;