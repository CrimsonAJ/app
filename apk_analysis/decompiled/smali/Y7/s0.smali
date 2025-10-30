.class public final LY7/s0;
.super LY7/y0;
.source "SourceFile"


# instance fields
.field public final d:LE7/d;


# direct methods
.method public constructor <init>(LE7/i;LO7/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LY7/a;-><init>(LE7/i;Z)V

    .line 3
    .line 4
    .line 5
    check-cast p2, LG7/a;

    .line 6
    .line 7
    invoke-virtual {p2, p0, p0}, LG7/a;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, LY7/s0;->d:LE7/d;

    .line 12
    .line 13
    return-void
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
    .line 33
    .line 34
    .line 35
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
.end method


# virtual methods
.method public final U()V
    .locals 2

    .line 1
    iget-object v0, p0, LY7/s0;->d:LE7/d;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D1;->A(LE7/d;)LE7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LA7/n;->a:LA7/n;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ld8/a;->h(LE7/d;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, LY7/a;->resumeWith(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    throw v0
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
