import React, { Component } from 'react';
import Contacts from './components/contact'

class App extends Component {

  state = {
    contacts: []
  }

  componentDidMount() {
    fetch('http://localhost:8080/contacts')
      .then(res => res.json())
      .then((data) => {
        this.setState({ contacts: data })
      })
      .catch(console.log);
  }

  render() {
    return (
      <Contacts contacts={this.state.contacts} />
    );
  }
}

export default App;
