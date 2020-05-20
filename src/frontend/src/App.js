import React, { Component } from 'react';
import Contact from './components/contact'

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
      <Contact contacts={this.state.contacts} />
    );
  }
}

export default App;
