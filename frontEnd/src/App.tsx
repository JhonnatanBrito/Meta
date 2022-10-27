import NotificationButton from "./components/NotificationButton";
import Header from "./components/Header";
import Aplicacation from "./components/Aplicacation";

function App() {
  return (
    <>
      <Header />

      <main>
        <section id="Aplicacation">
          <div className="dsmeta-container">
          
           <Aplicacation/>

          </div>
        </section>
      </main>



      <NotificationButton />

    </>
  )
}

export default App;
