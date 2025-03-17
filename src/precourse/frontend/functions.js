myFunctions = {
  getCompanyName: function () {
    return "SALT";
  },
};

function addListInMain(numberOfListItems) {
  const ulElement = document.createElement("ul");

  for (let i = 0; i < numberOfListItems; i++) {
    const liItem = document.createElement("li");
    liItem.textContent = `Fördel ${i + 1}: {insert_benefit_here}`;

    ulElement.appendChild(liItem);
  }

  const main = document.querySelector("main");
  main.appendChild(ulElement);
}
