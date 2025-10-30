.class public final Lco/notix/push/permissions/NotificationsPermissionActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/lf;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    invoke-static {}, Lco/notix/wq;->o()Lco/notix/lf;

    move-result-object v0

    iput-object v0, p0, Lco/notix/push/permissions/NotificationsPermissionActivity;->a:Lco/notix/lf;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lco/notix/push/permissions/NotificationsPermissionActivity;->a:Lco/notix/lf;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lco/notix/lf;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lco/notix/push/permissions/NotificationsPermissionActivity;->a:Lco/notix/lf;

    invoke-virtual {v0}, Lco/notix/lf;->c()Z

    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const p2, 0x11673

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lco/notix/push/permissions/NotificationsPermissionActivity;->a:Lco/notix/lf;

    invoke-virtual {p1}, Lco/notix/lf;->c()Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    iget-object v0, p0, Lco/notix/push/permissions/NotificationsPermissionActivity;->a:Lco/notix/lf;

    invoke-virtual {v0}, Lco/notix/lf;->c()Z

    return-void
.end method
