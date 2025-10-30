.class public final LJ0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI0/b;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Lo1/f;


# direct methods
.method public constructor <init>(Lo1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ0/b;->a:Lo1/f;

    .line 5
    .line 6
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final E(LO7/p;LG7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LJ0/b;->a:Lo1/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LQ0/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, LJ0/d;

    .line 11
    .line 12
    new-instance v2, LJ0/a;

    .line 13
    .line 14
    invoke-interface {v0}, LQ0/d;->Z()LQ0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v2, v0}, LJ0/a;-><init>(LQ0/a;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, LJ0/d;-><init>(LJ0/a;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v1, p2}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/b;->a:Lo1/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LQ0/d;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 8
    .line 9
    .line 10
    return-void
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
