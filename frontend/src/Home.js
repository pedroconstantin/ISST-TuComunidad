import React, { Component } from 'react';
import './App.css';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';
import { Button, Container } from 'reactstrap';
import './Home.css';
import logoComVec from './logoComVec.png'

class Home extends Component {
    render() {
        return (
            <div>
                <img src={logoComVec}  className="logo"/>
            <div className= "containerPrincipal">
                <div className= "containerSecundario">
                    <div className= "form-group">
                        <label>Usuario:</label>
                        <br />
                        <input type="text" className="form-control"
                        />
                        <label>Contraseña:</label>
                        <br />
                        <input type="password" className="form-control"
                        />
                        <br />

                <Container fluid>
                    <Button color="link"><Link to="/infos">INICIAR SESION</Link></Button>
                </Container>
                </div>
            </div>
        </div>
        </div>
        );
    }
}

export default Home;