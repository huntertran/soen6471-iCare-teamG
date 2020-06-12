import React, { Component } from 'react';
import Dashboard from "./components/Dashboard";

class App extends Component {

  state = {
    contacts: []
  }

  componentDidMount() {
    fetch('http://localhost:8080/profile')
      .then(res => res.json())
      .then((data) => {
        this.setState({ contacts: data })
      })
      .catch(console.log);
  }

  render() {
    return (
      <Dashboard />
    );
  }
}

export default App;
