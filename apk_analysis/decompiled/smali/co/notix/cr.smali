.class public final Lco/notix/cr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/dh;


# direct methods
.method public constructor <init>(Lco/notix/gh;Lco/notix/ic;)V
    .locals 1

    const-string v0, "notixRestClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/cr;->a:Lco/notix/dh;

    return-void
.end method
