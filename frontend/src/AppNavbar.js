import React, {Component} from 'react';
import {Navbar, NavbarBrand, NavLink} from 'reactstrap';
import {Link} from 'react-router-dom';
import { Button} from 'reactstrap';

export default class AppNavbar extends Component {
    constructor(props) {
        super(props);
        this.state = {isOpen: false};
        this.toggle = this.toggle.bind(this);
    }

    toggle() {
        this.setState({
            isOpen: !this.state.isOpen
        });
    }

    render() {
        return <Navbar color="dark" dark expand="md">
            <NavbarBrand tag={Link} to="/">Cerrar Sesion</NavbarBrand>
            <Button color="link"><Link to="/infos">TABLON DE INFO</Link></Button>
            <Button color="link"><Link to="/reunions">REUNIONES</Link></Button>
            <Button color="link"><Link to="/votacions">VOTACIONES</Link></Button>
            <Button color="link"><Link to="/reservas">RESERVAS</Link></Button>

        </Navbar>;
    }
}