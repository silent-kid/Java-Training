import { test, expect } from '@playwright/test';

test('alert', async ({ page }) => {
  await page.goto('https://testpages.eviltester.com/pages/basics/alerts-javascript/');

  page.on('dialog', async dialog => {
    console.log(`Alert message: ${dialog.message()}`);
    expect(dialog.message()).toContain('I am an alert box!');
    await page.waitForTimeout(2000);
    console.log('Accepting it now');
    await dialog.accept();
  });

  await page.getByRole('button', { name: 'Show alert box' }).click();
  await page.waitForTimeout(1000);
});
