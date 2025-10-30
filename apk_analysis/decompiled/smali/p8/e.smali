.class public final Lp8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/G;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Lx8/q;

.field public b:Z

.field public final synthetic c:LU6/a;


# direct methods
.method public constructor <init>(LU6/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp8/e;->c:LU6/a;

    .line 5
    .line 6
    new-instance v0, Lx8/q;

    .line 7
    .line 8
    iget-object p1, p1, LU6/a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lx8/B;

    .line 11
    .line 12
    iget-object p1, p1, Lx8/B;->a:Lx8/G;

    .line 13
    .line 14
    invoke-interface {p1}, Lx8/G;->c()Lx8/K;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Lx8/q;-><init>(Lx8/K;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lp8/e;->a:Lx8/q;

    .line 22
    .line 23
    return-void
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
.end method


# virtual methods
.method public final G(Lx8/g;J)V
    .locals 7

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lp8/e;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide v1, p1, Lx8/g;->b:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    move-wide v5, p2

    .line 15
    invoke-static/range {v1 .. v6}, Lk8/c;->c(JJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lp8/e;->c:LU6/a;

    .line 19
    .line 20
    iget-object p2, p2, LU6/a;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Lx8/B;

    .line 23
    .line 24
    invoke-virtual {p2, p1, v5, v6}, Lx8/B;->G(Lx8/g;J)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string p2, "closed"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
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

.method public final c()Lx8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/e;->a:Lx8/q;

    .line 2
    .line 3
    return-object v0
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

.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lp8/e;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lp8/e;->b:Z

    .line 8
    .line 9
    iget-object v0, p0, Lp8/e;->c:LU6/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lp8/e;->a:Lx8/q;

    .line 15
    .line 16
    iget-object v2, v1, Lx8/q;->e:Lx8/K;

    .line 17
    .line 18
    sget-object v3, Lx8/K;->d:Lx8/J;

    .line 19
    .line 20
    iput-object v3, v1, Lx8/q;->e:Lx8/K;

    .line 21
    .line 22
    invoke-virtual {v2}, Lx8/K;->a()Lx8/K;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lx8/K;->b()Lx8/K;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    iput v1, v0, LU6/a;->a:I

    .line 30
    .line 31
    return-void
    .line 32
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp8/e;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lp8/e;->c:LU6/a;

    .line 7
    .line 8
    iget-object v0, v0, LU6/a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lx8/B;

    .line 11
    .line 12
    invoke-virtual {v0}, Lx8/B;->flush()V

    .line 13
    .line 14
    .line 15
    return-void
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
