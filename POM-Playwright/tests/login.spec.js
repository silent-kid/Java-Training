import { test, expect } from "@playwright/test";
import { LoginPage } from "../pages/LoginPage";

test("login", async ({ page }) => {
  const login = new LoginPage(page);
  await page.goto("https://automationteststore.com");
  await page.getByRole('link', { name: 'Login', exact: true }).click();
  await login.login("username1029", "ecommerce");
});
