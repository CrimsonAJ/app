.class public final synthetic Le3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/b;
.implements Ll4/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILj3/q0;Lj3/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le3/g;->a:I

    iput-object p2, p0, Le3/g;->b:Ljava/lang/Object;

    iput-object p3, p0, Le3/g;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Le3/j;LY2/j;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Le3/g;->c:Ljava/lang/Object;

    iput p3, p0, Le3/g;->a:I

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Le3/g;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Le3/g;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Le3/j;

    .line 8
    .line 9
    iget-object v1, v1, Le3/j;->d:Le3/d;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, Le3/g;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, LY2/j;

    .line 15
    .line 16
    invoke-virtual {v1, v3, v0, v2}, Le3/d;->a(LY2/j;IZ)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return-object v0
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

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lj3/p0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le3/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj3/q0;

    .line 9
    .line 10
    iget-object v1, p0, Le3/g;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lj3/q0;

    .line 13
    .line 14
    iget v2, p0, Le3/g;->a:I

    .line 15
    .line 16
    invoke-interface {p1, v2, v0, v1}, Lj3/p0;->E(ILj3/q0;Lj3/q0;)V

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
