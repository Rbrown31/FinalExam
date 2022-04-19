**This is a open book test. However searching for solutions is prohibited.**

**Task 1:**
Add a landing screen - name it LandingActivity, display 4 buttons on the screen such as below - arrange in linear layout with vertical orientation
and aligned in the center of screen with a 20dp margin on all sides of each button. This will be the launcher activity, before Main Activity
was the launcher(Refer Android manifest.xml to change this)  **(10 marks)**
All Movies 
High Rated
Favorites
Latest

**Task 2:**
OnClick of All Movies - Navigate to Main Activity that displays list of movies with name displayed(exists already).
Similar to name, display categroy name of the movie below the name (Category name should not be bolded(2 marks)). **(8 + 2 marks)**

**Task 3:**
On click of High Rated - Navigate to Main Activity(Reuse the activity, layout, adapter class files) but display only High Rated movies **(9 marks).**
(Tip: Use Category from movie model class to filter the High Rated list of movies)
* Display one movie item per row. Right now 2 items per row is being displayed.**(1 mark)**
( Tip: Override the grid layoutManager or reduce the spanCount to show one item per row) 

**Task 4:**
On click of Favorites - Navigate to Main Activity(Reuse the activity, layout, adapter class files) but display only Favorite movies **(9 marks).**
(Tip: Use Category from movie model class to filter the Favourite list of movies)
* Display one movie item per row. Right now 2 items per row is being displayed.**(1 mark)**
(Tip: Override the grid layoutManager or reduce the spanCount to show one item per row)

**Task 5:**
On click of Latest - Navigate to Main Activity(Reuse the activity, layout, adapter class files) but display only Latest movies **(9 marks).**
(Tip: Use Category from movie model class to filter the Latest list of movies)
* Display one movie item per row. Right now 2 items per row is being displayed.**(1 mark)**
(Tip: Override the grid layoutManager or reduce the spanCount to show one item per row)

**Task 6:**
Create a details screen, name it MovieDetailsActivity, that will contain Image (Image will occupy half of the screen), followed by Name and Category
Use any layout you will be comfortable with. preffered linear layout or co-ordinator layout) **(10 marks)**

**Task 7:**
Onclick of each item in the recyler view pass the name, image url and category to the details activity, retrieve it in the details activity and show it
in the details screen.**(10 marks)**

**Task 8:**
Add a phoneNumber field (bonus 2 marks if you mark the field as nullable) in the movie data class and assign 709-123-4567 number to it. Display this phone number
at the end of latest movies list with a text displaying " To book tickets for this movie, Please call us at 709-123-4567". Onclick of phone number launch phone dialer to make the phone call.**(10 marks)**
Tip: Use data type, String for phone number (for simplicity and ease of implementation)

**Bonus : 5 marks - if all the Strings will be declared in strings.xml and used in the app instead of hardcoding in the layout xml files and the app looks pretty throughout.**
