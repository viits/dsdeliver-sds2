import {ToastContainer} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

import './App.css';
import Route from './Routes';

function App() {
  return (
    <>
      <Route />
      <ToastContainer />
    </>
  );
}

export default App;
