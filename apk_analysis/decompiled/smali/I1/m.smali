.class public abstract LI1/m;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lx7/b;


# instance fields
.field public a:Z

.field public final b:Lv7/f;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LI1/m;->a:Z

    .line 6
    .line 7
    new-instance v0, Lv7/f;

    .line 8
    .line 9
    new-instance v1, Lb7/c;

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    invoke-direct {v1, v2, p0}, Lb7/c;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lv7/f;-><init>(Lb7/c;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LI1/m;->b:Lv7/f;

    .line 20
    .line 21
    return-void
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


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LI1/m;->b:Lv7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv7/f;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
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

.method public onCreate()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LI1/m;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LI1/m;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, LI1/m;->b:Lv7/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Lv7/f;->e()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LI1/d;

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, Lcom/anilab/android/App;

    .line 18
    .line 19
    check-cast v0, LI1/j;

    .line 20
    .line 21
    iget-object v2, v0, LI1/j;->e:Ly7/b;

    .line 22
    .line 23
    invoke-interface {v2}, Lz7/a;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LL2/b;

    .line 28
    .line 29
    iput-object v2, v1, Lcom/anilab/android/App;->c:LL2/b;

    .line 30
    .line 31
    iget-object v2, v0, LI1/j;->f:Ly7/b;

    .line 32
    .line 33
    invoke-interface {v2}, Lz7/a;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, LL2/a;

    .line 38
    .line 39
    iput-object v2, v1, Lcom/anilab/android/App;->d:LL2/a;

    .line 40
    .line 41
    iget-object v2, v0, LI1/j;->g:Ly7/b;

    .line 42
    .line 43
    invoke-interface {v2}, Lz7/a;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, LL2/z;

    .line 48
    .line 49
    iput-object v2, v1, Lcom/anilab/android/App;->e:LL2/z;

    .line 50
    .line 51
    iget-object v0, v0, LI1/j;->h:Ly7/b;

    .line 52
    .line 53
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, LL2/y;

    .line 58
    .line 59
    iput-object v0, v1, Lcom/anilab/android/App;->f:LL2/y;

    .line 60
    .line 61
    :cond_0
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 62
    .line 63
    .line 64
    return-void
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
