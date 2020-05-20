import React from 'react'
import Card from '@material-ui/core/Card'
import CardContent from '@material-ui/core/CardContent'

class Contact extends React.Component {
    render() {
        return <div>
            <center><h1>Contact List</h1></center>
            {this.props.contacts.map((contact) => (
                <Card key={contact.id} variant="outlined">
                    <CardContent>
                        <h5>{contact.name}</h5>
                        <h6>{contact.email}</h6>
                        <p>{contact.company.catchPhrase}</p>
                    </CardContent>
                </Card>
            ))}
        </div>
    }
};

export default Contact;