.class public final Li0/x;
.super LB6/u0;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/k0;
.implements Landroidx/lifecycle/w;
.implements LN0/g;
.implements Li0/S;


# instance fields
.field public final n:Li0/y;

.field public final o:Li0/y;

.field public final p:Landroid/os/Handler;

.field public final q:Li0/N;

.field public final synthetic r:Li0/y;


# direct methods
.method public constructor <init>(Li0/y;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/x;->r:Li0/y;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Li0/N;

    .line 12
    .line 13
    invoke-direct {v1}, Li0/M;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Li0/x;->q:Li0/N;

    .line 17
    .line 18
    iput-object p1, p0, Li0/x;->n:Li0/y;

    .line 19
    .line 20
    iput-object p1, p0, Li0/x;->o:Li0/y;

    .line 21
    .line 22
    iput-object v0, p0, Li0/x;->p:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
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
.method public final G(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/x;->r:Li0/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public final H()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li0/x;->r:Li0/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
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

.method public final a(Li0/M;Li0/v;)V
    .locals 0

    .line 1
    iget-object p1, p0, Li0/x;->r:Li0/y;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
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

.method public final c()LN0/f;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/x;->r:Li0/y;

    .line 2
    .line 3
    iget-object v0, v0, Ld/l;->e:Lcom/google/android/gms/internal/measurement/C1;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/C1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LN0/f;

    .line 8
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

.method public final u()Landroidx/lifecycle/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/x;->r:Li0/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld/l;->u()Landroidx/lifecycle/j0;

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

.method public final x()LD/n;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/x;->r:Li0/y;

    .line 2
    .line 3
    iget-object v0, v0, Li0/y;->u:Landroidx/lifecycle/y;

    .line 4
    .line 5
    return-object v0
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
