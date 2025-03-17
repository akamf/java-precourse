myFunctions = {
  getCompanyName: function () {
    return "SALT";
  },
};

const addListInMain = (numberOfListItems) => {
  const ulElement = document.createElement("ul");

  for (let i = 0; i < numberOfListItems; i++) {
    const liItem = document.createElement("li");
    liItem.textContent = `Fördel ${i + 1}: {insert_benefit_here}`;

    ulElement.appendChild(liItem);
  }

  const main = document.querySelector("main");
  main.appendChild(ulElement);
}

const removeDivById = (id) => {
  const divToRemove = document.querySelector("div#" + id);
  if (divToRemove != undefined) {
    divToRemove.remove();
  }
}

const aFunctionToRunLater = () => {
  console.log("Document is loaded, y'all");
};

const getUsers = (element) => {
    fetch("https://randomuser.me/api/?gender=female&results=30")
        .then((response) => response.json())
        .then((data) => {
          const userList = document.createElement("div");

          for (let i = 0; i < data.results.length; i++) {
            const user = data.results[i];
            const userHeading = document.createElement("h2");
            userHeading.textContent = `${user.name.title} ${user.name.first} ${user.name.last}`;

            const userImage = document.createElement("img");
            userImage.src = `${user.picture.thumbnail}`;

            const userDiv = document.createElement("article");
            userDiv.appendChild(userHeading);
            userDiv.appendChild(userImage);

            userList.appendChild(userDiv);
          }

          element.appendChild(userList);
        });
}