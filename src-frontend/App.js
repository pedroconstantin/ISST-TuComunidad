import React, { Component } from 'react';
import './App.css';
import Home from './Home';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import INFOList from './INFOList';
import INFOEdit from './INFOEdit';

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/infos' exact={true} component={INFOList}/>
            <Route path='/infos/:idinfo' component={INFOEdit}/>
          </Switch>
        </Router>
    )
  }
}

export default App;