.class public final Lj3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/m;


# instance fields
.field public final a:Lb5/c0;

.field public final b:Lj3/J;

.field public c:Lj3/d;

.field public d:Ll4/m;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lj3/J;Ll4/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/j;->b:Lj3/J;

    .line 5
    .line 6
    new-instance p1, Lb5/c0;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lb5/c0;-><init>(Ll4/u;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lj3/j;->a:Lb5/c0;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lj3/j;->e:Z

    .line 15
    .line 16
    return-void
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
.method public final a(Lj3/m0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/j;->d:Ll4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ll4/m;->a(Lj3/m0;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lj3/j;->d:Ll4/m;

    .line 9
    .line 10
    invoke-interface {p1}, Ll4/m;->c()Lj3/m0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lj3/j;->a:Lb5/c0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lb5/c0;->a(Lj3/m0;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final b()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lj3/j;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lj3/j;->a:Lb5/c0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lb5/c0;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Lj3/j;->d:Ll4/m;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ll4/m;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
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

.method public final c()Lj3/m0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/j;->d:Ll4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ll4/m;->c()Lj3/m0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lj3/j;->a:Lb5/c0;

    .line 11
    .line 12
    iget-object v0, v0, Lb5/c0;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lj3/m0;

    .line 15
    .line 16
    return-object v0
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
