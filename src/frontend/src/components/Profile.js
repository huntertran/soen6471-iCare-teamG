import React, { Component } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import Switch from '@material-ui/core/Switch';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import { List, ListItem } from '@material-ui/core';

class Profile extends Component {

    state = {
        root: {
            maxWidth: 345,
        },
        profile: {
            insurance: false
        }
    }

    componentDidMount() {
        fetch('http://localhost:8080/profile')
            .then(res => res.json())
            .then((data) => {
                this.setState({ profile: data })
            })
            .catch(console.log);
    }

    render() {
        return (
            <Card>
                <CardActionArea>
                    <CardMedia
                        image="/static/images/avatar.jpg"
                        title="Contemplative Reptile"
                    />
                    <CardContent>
                        <Typography gutterBottom variant="h5" component="h2">
                            {this.state.profile.name}
                        </Typography>
                        <Typography variant="body2" color="textSecondary" component="p">
                            Date of birth: {this.state.profile.dob}
                        </Typography>
                        <Typography variant="body2" color="textSecondary" component="p">
                            User type: {this.state.profile.title}
                        </Typography>
                        <FormControlLabel
                            control={
                                <Switch
                                    checked={this.state.profile.insurance}
                                    name="insurance"
                                    color="primary"
                                />
                            }
                            label="Insurance"
                        />
                        <Typography gutterBottom variant="h5" component="h2">
                            List of Previous visits
                        </Typography>
                        <List>
                            {this.state.profile.previousVisits && this.state.profile.previousVisits.map((visit, index) => 
                                <ListItem key={index}>
                                    <Typography variant="body2" color="textSecondary" component="p">
                                        Date: {visit.dateTime}
                                        <br/>
                                        Description: {visit.description}
                                    </Typography>
                                </ListItem>
                            )}
                        </List>
                    </CardContent>
                </CardActionArea>
                <CardActions>
                    <Button size="small" color="primary">
                        Edit
                    </Button>
                </CardActions>
            </Card>
        );
    }
}

export default Profile;