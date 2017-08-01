# MyFlix
Homebrew Netflix for personal video library

Basic idea of this was to use an mvc model to separate concerns. There is a Library Object which holds movie objects, tvshow objects,
and sportsVideo objects. User objects each have a Library object and keys that determine their various levels of maturity for viewing. The 
Main class starts the intial Users, I contemplated creating a MyFlix object to hold Users and their libraries, but it began to feel too 
repititive and unnecessary. I am working on taking in the user's info stored in text files to be read/written to later on. Each video will
hold a code to save in a info text file for simpler access.

Current Ojbectives:
1) Create better method for locating the database holding the videos
2) Add Users and icons for the main screen (hindered by the inability to locate location of video database)
3) Set a 5 or 6 string code for each video to associate it in accessing the database.
