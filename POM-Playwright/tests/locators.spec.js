import { test, expect } from '@playwright/test';


test("textLoc", async({page})=>{
    await page.goto("https://playwright/dev");
    await page.getByText('Get Started').click();
})

test("labelLoc",async ({page})=>{
    await page.goto("https://login.salesforce.com/");
    await page.getByLabel('username').fill("Jawwad");
})