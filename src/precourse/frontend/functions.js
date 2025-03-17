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
