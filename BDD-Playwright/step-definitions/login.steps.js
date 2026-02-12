import { Given, When, Then, setDefaultTimeout } from "@cucumber/cucumber";
import assert from "assert";

setDefaultTimeout(60000);

Given("I open the login page", async function () {
  await this.page.goto("https://the-internet.herokuapp.com/login");
});

When("I login with valid credentials", async function () {
  await this.page.fill("#username", "tomsmith");
  await this.page.fill("#password", "SuperSecretPassword!");
  await this.page.click('button[type="submit"]');
});

Then("I should see a success message", async function () {
  const message = await this.page.locator("#flash").textContent();
  assert(message.includes("You logged into a secure area"));
});
