/* =====================================
   JavaScript Exercise 1
===================================== */

console.log("Welcome to the Community Portal");

window.onload = function () {
    alert("Welcome to the Community Portal");
};

/* =====================================
   JavaScript Exercise 2
===================================== */

const eventName = "Music Festival";
const eventDate = "2026-06-15";
let availableSeats = 50;

console.log(
    `Event: ${eventName} | Date: ${eventDate} | Seats: ${availableSeats}`
);

/* =====================================
   JavaScript Exercise 5
   Event Class & Prototype
===================================== */

class Event {

    constructor(name, category, seats) {

        this.name = name;
        this.category = category;
        this.seats = seats;
    }
}

Event.prototype.checkAvailability = function () {

    return this.seats > 0;
};

/* =====================================
   JavaScript Exercise 6
===================================== */

const events = [

    new Event("Music Festival", "Music", 50),
    new Event("Food Carnival", "Food", 40),
    new Event("Art Exhibition", "Art", 30),
    new Event("Dance Competition", "Dance", 20),
    new Event("Sports Meet", "Sports", 10),
    new Event("Tech Expo", "Technology", 25)
];

/* Push Example */

events.push(
    new Event("Book Fair", "Education", 15)
);

/* Filter Example */

const musicEvents =
    events.filter(event =>
        event.category === "Music"
    );

console.log(musicEvents);

/* Map Example */

const eventCards =
    events.map(event =>
        `Workshop on ${event.name}`
    );

console.log(eventCards);

/* =====================================
   JavaScript Exercise 3
===================================== */

events.forEach(event => {

    if (event.seats > 0) {

        console.log(
            `${event.name} available`
        );
    }
    else {

        console.log(
            `${event.name} full`
        );
    }
});

/* =====================================
   Exercise 4
===================================== */

function addEvent(name, category, seats) {

    events.push(
        new Event(name, category, seats)
    );
}

function registerUser(eventName) {

    try {

        const event =
            events.find(
                e => e.name === eventName
            );

        if (!event) {

            throw new Error(
                "Event not found"
            );
        }

        if (event.seats <= 0) {

            throw new Error(
                "No seats available"
            );
        }

        event.seats--;

        return true;
    }
    catch (error) {

        console.error(error.message);

        return false;
    }
}

function filterEventsByCategory(
    category,
    callback
) {

    const result =
        events.filter(
            event =>
                event.category === category
        );

    callback(result);
}

/* =====================================
   Closure Example
===================================== */

function registrationCounter() {

    let count = 0;

    return function () {

        count++;

        return count;
    };
}

const countRegistrations =
    registrationCounter();

/* =====================================
   Object.entries()
===================================== */

Object.entries(events[0])
    .forEach(entry =>
        console.log(entry)
    );

/* =====================================
   DOM Manipulation
===================================== */

document.addEventListener(
    "DOMContentLoaded",
    function () {

        const eventsSection =
            document.querySelector(
                "#events"
            );

        events.forEach(event => {

            const card =
                document.createElement(
                    "div"
                );

            card.className =
                "eventCard";

            card.innerHTML =
                `
                <h3>${event.name}</h3>
                <p>Category:
                ${event.category}</p>
                <p>Seats:
                ${event.seats}</p>
                `;

            eventsSection.appendChild(
                card
            );
        });
    }
);

/* =====================================
   HTML Exercise 6
===================================== */

function validatePhone() {

    const phone =
        document.getElementById(
            "phone"
        ).value;

    const error =
        document.getElementById(
            "phoneError"
        );

    if (
        !/^[0-9]{10}$/.test(phone)
    ) {

        error.innerHTML =
            "Enter valid 10 digit phone number";
    }
    else {

        error.innerHTML = "";
    }
}

/* =====================================
   Fee Display
===================================== */

function showFee() {

    const event =
        document.getElementById(
            "eventType"
        ).value;

    const feeDisplay =
        document.getElementById(
            "eventFee"
        );

    const fees = {

        "Music Festival": "₹500",
        "Food Carnival": "₹300",
        "Art Exhibition": "₹250",
        "Dance Competition": "₹400",
        "Sports Meet": "₹350",
        "Tech Expo": "₹600"
    };

    feeDisplay.innerHTML =
        "Event Fee: " +
        (fees[event] || "N/A");
}

/* =====================================
   Form Submission
===================================== */

function showConfirmation() {

    document.getElementById(
        "confirmationOutput"
    ).innerHTML =
        "Registration Submitted Successfully";
}

/* =====================================
   Image Double Click
===================================== */

function enlargeImage(image) {

    if (
        image.style.width === "500px"
    ) {

        image.style.width = "250px";
    }
    else {

        image.style.width = "500px";
    }
}

/* =====================================
   Character Counter
===================================== */

function countCharacters() {

    const text =
        document.getElementById(
            "feedbackText"
        ).value;

    document.getElementById(
        "charCount"
    ).innerHTML =
        text.length;
}

/* =====================================
   Video Event
===================================== */

function videoReady() {

    document.getElementById(
        "videoMessage"
    ).innerHTML =
        "Video ready to play";
}

/* =====================================
   Before Unload
===================================== */

window.onbeforeunload =
    function () {

        return "You have unsaved data";
    };

/* =====================================
   Local Storage
===================================== */

function savePreference() {

    const selectedEvent =
        document.getElementById(
            "eventType"
        ).value;

    localStorage.setItem(
        "preferredEvent",
        selectedEvent
    );
}

window.addEventListener(
    "load",
    function () {

        const savedEvent =
            localStorage.getItem(
                "preferredEvent"
            );

        if (savedEvent) {

            document.getElementById(
                "eventType"
            ).value =
                savedEvent;
        }
    }
);

/* =====================================
   Clear Storage
===================================== */

function clearPreferences() {

    localStorage.clear();

    sessionStorage.clear();

    alert(
        "Preferences Cleared"
    );
}

/* =====================================
   Geolocation
===================================== */

function findLocation() {

    if (
        navigator.geolocation
    ) {

        navigator.geolocation
            .getCurrentPosition(

                success,
                error,

                {
                    enableHighAccuracy:
                        true,

                    timeout: 10000
                }
            );
    }
}

function success(position) {

    document.getElementById(
        "locationResult"
    ).innerHTML =
        `
        Latitude:
        ${position.coords.latitude}
        <br>
        Longitude:
        ${position.coords.longitude}
        `;
}

function error(err) {

    document.getElementById(
        "locationResult"
    ).innerHTML =
        err.message;
}

/* =====================================
   Fetch API
===================================== */

fetch(
    "https://jsonplaceholder.typicode.com/posts/1"
)
.then(response =>
    response.json()
)
.then(data =>
    console.log(data)
)
.catch(error =>
    console.error(error)
);

/* =====================================
   Async Await
===================================== */

async function loadEvents() {

    try {

        console.log(
            "Loading..."
        );

        const response =
            await fetch(
                "https://jsonplaceholder.typicode.com/posts/1"
            );

        const data =
            await response.json();

        console.log(data);
    }
    catch (error) {

        console.error(error);
    }
}

loadEvents();

/* =====================================
   Registration Form
===================================== */

document
.getElementById(
    "registrationForm"
)
.addEventListener(
    "submit",
    function (event) {

        event.preventDefault();

        const form =
            event.target;

        const name =
            form.elements["name"].value;

        const email =
            form.elements["email"].value;

        const selectedEvent =
            form.elements["eventType"].value;

        console.log(
            name,
            email,
            selectedEvent
        );

        setTimeout(
            function () {

                alert(
                    "Registration Successful"
                );
            },
            1000
        );
    }
);

/* =====================================
   Modern JavaScript Features
===================================== */

const copiedEvents =
    [...events];

const [firstEvent] =
    copiedEvents;

console.log(firstEvent);

/* =====================================
   jQuery Example
===================================== */

/*
$(document).ready(function(){

    $('#registerBtn').click(function(){

        $('.eventCard').fadeOut();

        $('.eventCard').fadeIn();
    });

});
*/

/*
Benefit of React/Vue:

Reusable components,
better state management,
faster UI updates.
*/
