// Bertipe Object

const restaurant = {
    name: "Rawless",
    city: "Sukabumi",
    favoriteDrink: "Teh Poci",
    favoriteFood: "Seblak",
    isVegan: false,
  };
  
  const { name, city, favoriteDrink, favoriteFood, isVegan } = restaurant;
  console.log("Nama : " + name);
  console.log("Kota : " + city);
  console.log("Minuman Favorit : " + favoriteDrink);
  console.log("Makanan Favorit : " + favoriteFood);
  console.log("Vegan : " + isVegan);