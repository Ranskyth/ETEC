import { BrowserRouter, Route, Routes } from "react-router";
import { Home } from "./pages/home";
import { Login } from "./pages/login";
import { Hello } from "./pages/hello";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Hello/>}/>
        <Route path="/home" element={<Home />} />
        <Route path="/login" element={<Login />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
