.class public final Lb5/t1;
.super Lb5/B;
.source "SourceFile"


# instance fields
.field public c:LT4/d;

.field public d:Z

.field public final e:Lo1/f;

.field public final f:LN3/X;

.field public final g:LO0/c;


# direct methods
.method public constructor <init>(Lb5/n0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lb5/B;-><init>(Lb5/n0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lb5/t1;->d:Z

    .line 6
    .line 7
    new-instance p1, Lo1/f;

    .line 8
    .line 9
    const/16 v0, 0x1c

    .line 10
    .line 11
    invoke-direct {p1, v0, p0}, Lo1/f;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lb5/t1;->e:Lo1/f;

    .line 15
    .line 16
    new-instance p1, LN3/X;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p0, p1, LN3/X;->d:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v0, Lb5/s1;

    .line 24
    .line 25
    iget-object v1, p0, LD/n;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lb5/n0;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, p1, v1, v2}, Lb5/s1;-><init>(Ljava/lang/Object;Lb5/y0;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p1, LN3/X;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v0, p0, LD/n;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lb5/n0;

    .line 38
    .line 39
    iget-object v0, v0, Lb5/n0;->n:LK4/a;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iput-wide v0, p1, LN3/X;->a:J

    .line 49
    .line 50
    iput-wide v0, p1, LN3/X;->b:J

    .line 51
    .line 52
    iput-object p1, p0, Lb5/t1;->f:LN3/X;

    .line 53
    .line 54
    new-instance p1, LO0/c;

    .line 55
    .line 56
    const/16 v0, 0xe

    .line 57
    .line 58
    invoke-direct {p1, v0, p0}, LO0/c;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lb5/t1;->g:LO0/c;

    .line 62
    .line 63
    return-void
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


# virtual methods
.method public final o0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
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

.method public final p0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb5/A;->l0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb5/t1;->c:LT4/d;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, LT4/d;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x5

    .line 15
    invoke-direct {v0, v1, v2}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lb5/t1;->c:LT4/d;

    .line 19
    .line 20
    :cond_0
    return-void
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
