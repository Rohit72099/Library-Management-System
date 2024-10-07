const books=[
    {
        "title": "The Silent Ocean",
        "author": "John Doe",
        "genre": "Fiction",
        "image_url": "https://covers.openlibrary.org/b/id/8230916-L.jpg"
    },
    {
        "title": "Journey to the Unknown",
        "author": "Jane Smith",
        "genre": "Adventure",
        "image_url": "https://covers.openlibrary.org/b/id/8234158-L.jpg"
    },
    {
        "title": "Mystery of the Lost City",
        "author": "Robert Brown",
        "genre": "Mystery",
        "image_url": "https://covers.openlibrary.org/b/id/8244151-L.jpg"
    },
    {
        "title": "A Walk Through Time",
        "author": "Emily White",
        "genre": "Science Fiction",
        "image_url": "https://covers.openlibrary.org/b/id/8232006-L.jpg"
    },
    {
        "title": "Cooking with Passion",
        "author": "Gordon Green",
        "genre": "Cookbook",
        "image_url": "https://covers.openlibrary.org/b/id/8240303-L.jpg"
    },
    {
        "title": "The Art of Zen",
        "author": "Linda Black",
        "genre": "Philosophy",
        "image_url": "https://covers.openlibrary.org/b/id/8239201-L.jpg"
    },
    {
        "title": "Gardening for Beginners",
        "author": "Susan Blue",
        "genre": "Gardening",
        "image_url": "https://covers.openlibrary.org/b/id/8232107-L.jpg"
    },
    {
        "title": "Travel Guide to Europe",
        "author": "Michael Gray",
        "genre": "Travel",
        "image_url": "https://covers.openlibrary.org/b/id/8236220-L.jpg"
    },
    {
        "title": "The Secret of Happiness",
        "author": "Laura Purple",
        "genre": "Self-Help",
        "image_url": "https://covers.openlibrary.org/b/id/8245060-L.jpg"
    },
    {
        "title": "History of Ancient Civilizations",
        "author": "Paul Gold",
        "genre": "History",
        "image_url": "https://covers.openlibrary.org/b/id/8235214-L.jpg"
    },
    {
        "title": "The Great War",
        "author": "George Silver",
        "genre": "Non-Fiction",
        "image_url": "https://covers.openlibrary.org/b/id/8231123-L.jpg"
    },
    {
        "title": "Innovations in Technology",
        "author": "Alice Orange",
        "genre": "Technology",
        "image_url": "https://covers.openlibrary.org/b/id/8236301-L.jpg"
    },
    {
        "title": "Fantasy Land",
        "author": "Brian Violet",
        "genre": "Fantasy",
        "image_url": "https://covers.openlibrary.org/b/id/8237198-L.jpg"
    },
    {
        "title": "The Last Frontier",
        "author": "Kevin Indigo",
        "genre": "Science Fiction",
        "image_url": "https://covers.openlibrary.org/b/id/8238267-L.jpg"
    },
    {
        "title": "Deep Space Chronicles",
        "author": "Natalie Cyan",
        "genre": "Science Fiction",
        "image_url": "https://covers.openlibrary.org/b/id/8239345-L.jpg"
    },
    {
        "title": "Meditation for the Soul",
        "author": "Oscar Maroon",
        "genre": "Spirituality",
        "image_url": "https://covers.openlibrary.org/b/id/8240420-L.jpg"
    },
    {
        "title": "The Art of Drawing",
        "author": "Patricia Scarlet",
        "genre": "Art",
        "image_url": "https://covers.openlibrary.org/b/id/8231532-L.jpg"
    },
    {
        "title": "Building Your Dream Home",
        "author": "Quentin Teal",
        "genre": "Architecture",
        "image_url": "https://covers.openlibrary.org/b/id/8242601-L.jpg"
    },
    {
        "title": "Fitness for Life",
        "author": "Rachel Amber",
        "genre": "Health",
        "image_url": "https://covers.openlibrary.org/b/id/8241615-L.jpg"
    },
    {
        "title": "Programming in Python",
        "author": "Steven Lime",
        "genre": "Technology",
        "image_url": "https://covers.openlibrary.org/b/id/8240110-L.jpg"
    },
    {
        "title": "Tales of the Unknown",
        "author": "Thomas Peach",
        "genre": "Horror",
        "image_url": "https://covers.openlibrary.org/b/id/8238799-L.jpg"
    },
    {
        "title": "Mastering the Piano",
        "author": "Ursula Bronze",
        "genre": "Music",
        "image_url": "https://covers.openlibrary.org/b/id/8240630-L.jpg"
    },
    {
        "title": "Mysteries of the Universe",
        "author": "Victor Yellow",
        "genre": "Science",
        "image_url": "https://covers.openlibrary.org/b/id/8242923-L.jpg"
    },
    {
        "title": "The Power of Positive Thinking",
        "author": "Wendy Chartreuse",
        "genre": "Self-Help",
        "image_url": "https://covers.openlibrary.org/b/id/8237062-L.jpg"
    },
    {
        "title": "Understanding Economics",
        "author": "Xavier Jade",
        "genre": "Economics",
        "image_url": "https://covers.openlibrary.org/b/id/8238086-L.jpg"
    },
    {
        "title": "A Journey Through Time",
        "author": "Yvonne Mint",
        "genre": "History",
        "image_url": "https://covers.openlibrary.org/b/id/8239217-L.jpg"
    },
    {
        "title": "Wildlife of the World",
        "author": "Zachary Olive",
        "genre": "Nature",
        "image_url": "https://covers.openlibrary.org/b/id/8244035-L.jpg"
    },
    {
        "title": "The Art of Communication",
        "author": "Andrea Pink",
        "genre": "Communication",
        "image_url": "https://covers.openlibrary.org/b/id/8243024-L.jpg"
    },
    {
        "title": "Living with Nature",
        "author": "Bruce Mahogany",
        "genre": "Nature",
        "image_url": "https://covers.openlibrary.org/b/id/8243937-L.jpg"
    },
    {
        "title": "Mastering Photography",
        "author": "Catherine Magenta",
        "genre": "Photography",
        "image_url": "https://covers.openlibrary.org/b/id/8242004-L.jpg"
    },
    {
        "title": "The Complete Guide to Chess",
        "author": "Derek Ruby",
        "genre": "Games",
        "image_url": "https://covers.openlibrary.org/b/id/8240832-L.jpg"
    },
    {
        "title": "Understanding the Brain",
        "author": "Eleanor Sienna",
        "genre": "Science",
        "image_url": "https://covers.openlibrary.org/b/id/8240129-L.jpg"
    },
    {
        "title": "Digital Marketing Strategies",
        "author": "Frank Copper",
        "genre": "Business",
        "image_url": "https://covers.openlibrary.org/b/id/8240625-L.jpg"
    },
    {
        "title": "Secrets of the Ancient World",
        "author": "Grace Ivory",
        "genre": "History",
        "image_url": "https://covers.openlibrary.org/b/id/8244034-L.jpg"
    },
    {
        "title": "The Universe Explained",
        "author": "Henry Jasper",
        "genre": "Science",
        "image_url": "https://covers.openlibrary.org/b/id/8244033-L.jpg"
    },
    {
        "title": "The Writer's Handbook",
        "author": "Isabella Tan",
        "genre": "Writing",
        "image_url": "https://covers.openlibrary.org/b/id/8243936-L.jpg"
    },
    {
        "title": "Exploring the Deep Sea",
        "author": "Jackie Coral",
        "genre": "Science",
        "image_url": "https://covers.openlibrary.org/b/id/8244031-L.jpg"
    },
    {
        "title": "Photography Basics",
        "author": "Karen Umber",
        "genre": "Photography",
        "image_url": "https://covers.openlibrary.org/b/id/8243126-L.jpg"
    },
    {
        "title": "The World of Fine Arts",
        "author": "Laura Amber",
        "genre": "Art",
        "image_url": "https://covers.openlibrary.org/b/id/8244032-L.jpg"
    }
]


function createCard(book) {
const card = document.createElement('div');
card.className='card';

const img = document.createElement('div');
img.className='img';
card.appendChild(img);

const image = document.createElement('img');
img.appendChild(image);
image.src=book.image_url;
image.alt='books_image'

const content = document.createElement('div');
content.className='content';
card.appendChild(content);


const detail=document.createElement('div');
detail.className='detail';
content.appendChild(detail);

const title = document.createElement('h4');
detail.appendChild(title);
title.textContent=book.title;

const author = document.createElement('h4');
detail.appendChild(author);
author.textContent=`Author :- ${book.author}`;


 const btn = document.createElement('div');
 btn.className='btn';
 content.appendChild(btn);

const issue = document.createElement('button');
btn.appendChild(issue);
issue.innerHTML='issue Book'
issue.id='issue';
issue.addEventListener('click', () => openBookForm(book));




 return card;

}
const out = document.getElementById('container');
books.forEach(book => {
    const card = createCard(book);
    out.appendChild(card);
});



function openBookForm(book) {
    const formHtml = `
        <form id="bookForm" action="BookServlet" method="post">
            <label for="title">Title:</label>
            <input type="text" id="title" name="title" value="${book.title}" readonly><br><br>
            <label for="author">Author:</label>
            <input type="text" id="author" name="author" value="${book.author}" readonly><br><br>
			<label for="username">Username:</label>
			 <input type="text" id="username" name="username" value="" required><br><br>
			
			
            <button type="submit">Submit</button>
        </form>
    `;
    const newWindow = window.open("", "_blank", "width=400,height=300");
    newWindow.document.write(formHtml);
    newWindow.document.close();
}

