.class public final Lz8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/j;
.implements Lk4/O;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk4/O;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz8/w;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lz8/w;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz8/y;Lz8/g;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/w;->b:Ljava/lang/Object;

    iput-object p2, p0, Lz8/w;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c(Ln8/g;Li8/L;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz8/w;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lz8/g;

    .line 4
    .line 5
    iget-object v0, p0, Lz8/w;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lz8/y;

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, p2}, Lz8/y;->e(Li8/L;)Lz8/O;

    .line 10
    .line 11
    .line 12
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    invoke-interface {p1, v0, p2}, Lz8/g;->g(Lz8/d;Lz8/O;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-static {p1}, Lz8/X;->s(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_1
    move-exception p2

    .line 26
    invoke-static {p2}, Lz8/X;->s(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-interface {p1, v0, p2}, Lz8/g;->e(Lz8/d;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_2
    move-exception p1

    .line 34
    invoke-static {p1}, Lz8/X;->s(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
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

.method public f(Ln8/g;Ljava/io/IOException;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lz8/w;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lz8/g;

    .line 4
    .line 5
    iget-object v0, p0, Lz8/w;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lz8/y;

    .line 8
    .line 9
    invoke-interface {p1, v0, p2}, Lz8/g;->e(Lz8/d;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lz8/X;->s(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
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

.method public k(Landroid/net/Uri;Lk4/o;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz8/w;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk4/O;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lk4/O;->k(Landroid/net/Uri;Lk4/o;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM3/a;

    .line 10
    .line 11
    iget-object p2, p0, Lz8/w;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {p1, p2}, LM3/a;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LM3/a;

    .line 29
    .line 30
    :cond_1
    :goto_0
    return-object p1
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
