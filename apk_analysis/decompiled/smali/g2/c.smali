.class public abstract Lg2/c;
.super Li/h;
.source "SourceFile"

# interfaces
.implements Lx7/b;


# instance fields
.field public volatile A:Lv7/b;

.field public final B:Ljava/lang/Object;

.field public C:Z

.field public z:Lcom/google/firebase/messaging/u;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Li/h;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg2/c;->B:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lg2/c;->C:Z

    .line 13
    .line 14
    new-instance v0, LL1/a;

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, v1, v2}, LL1/a;-><init>(Li/h;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ld/l;->J(Le/a;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final S()Lv7/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lg2/c;->A:Lv7/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lg2/c;->B:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lg2/c;->A:Lv7/b;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lv7/b;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lv7/b;-><init>(Li/h;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lg2/c;->A:Lv7/b;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    iget-object v0, p0, Lg2/c;->A:Lv7/b;

    .line 27
    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg2/c;->S()Lv7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv7/b;->e()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final j()Landroidx/lifecycle/h0;
    .locals 4

    .line 1
    invoke-super {p0}, Ld/l;->j()Landroidx/lifecycle/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lu7/a;

    .line 6
    .line 7
    invoke-static {v1, p0}, Lv4/e;->p(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lu7/a;

    .line 12
    .line 13
    check-cast v1, LI1/e;

    .line 14
    .line 15
    invoke-virtual {v1}, LI1/e;->a()Lk4/E;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lu7/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v3, v1, Lk4/E;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, LA1/g;

    .line 27
    .line 28
    iget-object v1, v1, Lk4/E;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lk4/v;

    .line 31
    .line 32
    invoke-direct {v2, v1, v0, v3}, Lu7/e;-><init>(Lk4/v;Landroidx/lifecycle/h0;LA1/g;)V

    .line 33
    .line 34
    .line 35
    return-object v2
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Li0/y;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of p1, p1, Lx7/b;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lg2/c;->S()Lv7/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, Lv7/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lv7/b;

    .line 19
    .line 20
    iget-object v0, p1, Lv7/b;->c:Ld/l;

    .line 21
    .line 22
    iget-object p1, p1, Lv7/b;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ld/l;

    .line 25
    .line 26
    new-instance v1, Landroid/support/v4/media/session/y;

    .line 27
    .line 28
    new-instance v2, Lm0/c;

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    invoke-direct {v2, v3, p1}, Lm0/c;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Landroid/support/v4/media/session/y;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;)V

    .line 35
    .line 36
    .line 37
    const-class p1, Lv7/d;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/y;->J(Ljava/lang/Class;)Landroidx/lifecycle/e0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lv7/d;

    .line 44
    .line 45
    iget-object p1, p1, Lv7/d;->e:Lcom/google/firebase/messaging/u;

    .line 46
    .line 47
    iput-object p1, p0, Lg2/c;->z:Lcom/google/firebase/messaging/u;

    .line 48
    .line 49
    iget-object v0, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lm0/d;

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, Ld/l;->p()Lm0/d;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 60
    .line 61
    :cond_0
    return-void
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Li/h;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg2/c;->z:Lcom/google/firebase/messaging/u;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, v0, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
