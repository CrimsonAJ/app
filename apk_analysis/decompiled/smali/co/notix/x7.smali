.class public final Lco/notix/x7;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:Lco/notix/c8;


# direct methods
.method public constructor <init>(Lco/notix/c8;)V
    .locals 0

    iput-object p1, p0, Lco/notix/x7;->a:Lco/notix/c8;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lco/notix/x7;->a:Lco/notix/c8;

    .line 2
    .line 3
    iget-object v0, v0, Lco/notix/c8;->a:Lco/notix/y8;

    .line 4
    .line 5
    check-cast v0, Lco/notix/d9;

    .line 6
    .line 7
    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "notix_images_cache"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
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
