.class public final Lu0/l;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lu0/m;


# direct methods
.method public synthetic constructor <init>(Lu0/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu0/l;->d:I

    iput-object p1, p0, Lu0/l;->e:Lu0/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lu0/l;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu0/l;->e:Lu0/m;

    .line 7
    .line 8
    iget-boolean v1, v0, Lu0/m;->j:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Lu0/m;->h:Landroidx/lifecycle/y;

    .line 13
    .line 14
    iget-object v2, v1, Landroidx/lifecycle/y;->d:Landroidx/lifecycle/p;

    .line 15
    .line 16
    sget-object v3, Landroidx/lifecycle/p;->a:Landroidx/lifecycle/p;

    .line 17
    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    new-instance v2, Landroid/support/v4/media/session/y;

    .line 21
    .line 22
    new-instance v3, Lu0/j;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v4, v0, Lu0/m;->i:Lcom/google/android/gms/internal/measurement/C1;

    .line 28
    .line 29
    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/C1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, LN0/f;

    .line 32
    .line 33
    iput-object v4, v3, Lu0/j;->a:LN0/f;

    .line 34
    .line 35
    iput-object v1, v3, Lu0/j;->b:LD/n;

    .line 36
    .line 37
    invoke-direct {v2, v0, v3}, Landroid/support/v4/media/session/y;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;)V

    .line 38
    .line 39
    .line 40
    const-class v0, Lu0/k;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Landroid/support/v4/media/session/y;->J(Ljava/lang/Class;)Landroidx/lifecycle/e0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lu0/k;

    .line 47
    .line 48
    iget-object v0, v0, Lu0/k;->d:Landroidx/lifecycle/V;

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :pswitch_0
    new-instance v0, Landroidx/lifecycle/b0;

    .line 68
    .line 69
    iget-object v1, p0, Lu0/l;->e:Lu0/m;

    .line 70
    .line 71
    iget-object v2, v1, Lu0/m;->a:Landroid/content/Context;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    move-object v2, v3

    .line 82
    :goto_0
    instance-of v4, v2, Landroid/app/Application;

    .line 83
    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    move-object v3, v2

    .line 87
    check-cast v3, Landroid/app/Application;

    .line 88
    .line 89
    :cond_3
    invoke-virtual {v1}, Lu0/m;->a()Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {v0, v3, v1, v2}, Landroidx/lifecycle/b0;-><init>(Landroid/app/Application;LN0/g;Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
